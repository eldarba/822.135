// declaring classes
class Shape{
    // constructor and fields
    constructor(color){
        this.color = color;
    }

    // method
    print() {
        console.log("shape color is " + this.color);    
    }
}

class Rectangle extends Shape{
    constructor(color, length, width){
        super(color);
        this.length = length;
        this.width = width;
    }

    getArea(){
        return this.length * this.width;
    }
}

let s = new Shape("red");
console.log(s);
s.print();

let r = new Rectangle("blue", 5, 7);
console.log(r);
console.log("area: " + r.getArea());
r.print();