
let a = 3, b;

console.log(b); // undefined

b = 20;
console.log(b);

// power operator
console.log("3^5 = " + 3 ** 5);

let x, y;
x = 5;
y = "5";
console.log(x == y); // value
console.log(x === y); // value + type

//types: number, string, boolean, object, function
// checking types
console.log(typeof x);
console.log(typeof y);

x = false;
console.log(typeof x);

x = [];
console.log(typeof x);

x = function(){};
console.log(typeof x);

let date = new Date();
console.log(typeof date);
console.log(date instanceof Date);
console.log(date instanceof String);

date = new Date(2020, 0);
date = new Date(2020, 0, 15);
date = new Date(2020, 0, 15, 17, 30, 10);
date = new Date("2021-05-17");

date.setDate(date.getDate()+1);
console.log(date);

// undefined vs null
console.log(typeof undefined);
console.log(typeof null);

let a1 = null;
let a2 = undefined;

console.log(a1 == a2);
console.log(a1 === a2);

