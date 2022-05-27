// var x;
{
    var x = 1; // hoisted no scope
    let y = 2;
    const z = 3;

    console.log(x);
    console.log(y);
    console.log(z);
    // z = 10; // error
}
console.log("out of scope");
console.log(x);
// console.log(y); //error
// console.log(z); //error