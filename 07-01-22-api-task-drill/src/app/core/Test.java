package app.core;

import java.time.LocalDateTime;

public class Test {

	public static void main(String[] args) {
		Scheduler scheduler = new Scheduler();
		scheduler.startMonitoringTasks();
		try {
			scheduler.addTask(new Task(101, "test", LocalDateTime.now().plusSeconds(10)));
			scheduler.addTask(new Task(102, "test2", LocalDateTime.now()));
			scheduler.addTask(new Task(101, "test", LocalDateTime.now()));
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
//		boolean isDeleted = scheduler.removeTask(101);
		scheduler.displayTasks();

		try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		scheduler.stopMonitoringTasks();

	}
}
