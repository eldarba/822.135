package app.core;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Scheduler {

	private List<Task> tasks = new ArrayList<>();
	private boolean monitoringActive;
	private long checkRateMilis = 3000;

	/**
	 * add a task to this scheduler
	 * 
	 * @param task the task to add
	 * @throws RuntimeException if task by this id alredy exists
	 */
	public synchronized void addTask(Task task) throws RuntimeException {
		if (tasks.contains(task)) {
			throw new RuntimeException("addTask failed - already exist");
		}
		this.tasks.add(task);
	}

	/**
	 * delete the specified task
	 * 
	 * @param taskId
	 * @return true if deleted, false if not (not found)
	 */
	public synchronized boolean removeTask(int taskId) {
		Task task = new Task(taskId); // this task is meant for identification
		return tasks.remove(task);
	}

	public void displayTasks() {
		System.out.println("Tasks in Scheduler ==============");
		for (Task task : tasks) {
			System.out.println(task);
		}
		System.out.println("=================================");
	}

	/**
	 * @param taskId
	 * @return the specified task or null if not found
	 */
	public Task getTaskById(int taskId) {
		int index = this.tasks.indexOf(new Task(taskId));
		if (index != -1) {
			return tasks.get(index);
		}
		return null;
	}

	public List<Task> getTasks() {
		return tasks;
	}

	public synchronized List<Task> getTasksDueUntil(LocalDateTime latestDeadline) {
		List<Task> dueTasks = new ArrayList<>();
		for (Task task : this.tasks) {
			if (task.getDeadline().isBefore(latestDeadline)) {
				dueTasks.add(task);
			}
		}
		return dueTasks;
	}

	public synchronized List<Task> getTasksDue() {
		return getTasksDueUntil(LocalDateTime.now());
	}

	public void startMonitoringTasks() {
		this.monitoringActive = true;
		TaskAlertThread alertThread = new TaskAlertThread();
		alertThread.start();
	}

	public void stopMonitoringTasks() {
		this.monitoringActive = false;
	}

	// define a thread as inner class
	private class TaskAlertThread extends Thread {
		@Override
		public void run() {
			System.out.println("monitoring tasks started");
			while (monitoringActive) {
				for (Task task : getTasksDue()) {
					if (!task.isAlertPopped()) {
						System.out.println("!!! Deadline Alert " + task);
						task.setAlertPopped(true);
					}
				}
				try {
					Thread.sleep(checkRateMilis);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("monitoring tasks ended");
		}
	}
}
