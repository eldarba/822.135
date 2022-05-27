// {} is object
let obj = { 
    id: 101, 
    name: 'dan',
    printDetails: function(){
        console.log("id: " + this.id + ", name: " + this.name);
    }
 };
console.log(obj);

console.log(obj.id);
console.log(obj.name);

obj.name = 'alon';
// access fields
console.log(obj.name); // using . operator
console.log(obj["name"]); // using [] operator

// we can add new fields
obj.address = "Jerusalem, Israel"
console.log(obj.address);
console.log(obj);

// call a function
obj.printDetails();

