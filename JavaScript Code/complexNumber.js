function Complex(real, imaginary) {
    this.real = 0;
    this.imaginary = 0;
    this.real = (typeof real === 'undefined') ? this.real : parseFloat(real);
    this.imaginary = (typeof imaginary === 'undefined') ? this.imaginary : parseFloat(imaginary);
  }
  Complex.transform = function(num) {
    var complex;
    complex = (num instanceof Complex) ? num : complex;
    complex = (typeof num === 'number') ? new Complex(num, 0) : num;
    return complex;
  };
  
  function display_complex(re, im) {
    if(im === '0') return '' + re;
    if(re === 0) return '' + im + 'i';
    if(im < 0) return '' + re + im + 'i';
    return '' + re + '+' + im + 'i';
  }
  
  function complex_num_add(first, second) {
    var num1, num2;
    num1 = Complex.transform(first);
    num2 = Complex.transform(second);
    var real = num1.real + num2.real;
    var imaginary = num1.imaginary + num2.imaginary;
    return display_complex(real, imaginary);
  }
  
  function complex_num_sub(first, second) {
    var num1, num2;
    num1 = Complex.transform(first);
    num2 = Complex.transform(second);
    var real = num1.real - num2.real;
    var imaginary = num1.imaginary - num2.imaginary;
    return display_complex(real, imaginary);
  }
  
  function complex_num_mul(first, second) {
    var num1, num2;
    num1 = Complex.transform(first);
    num2 = Complex.transform(second);
    var real = (num1.real * num2.real) - (num1.imaginary * num2.imaginary);
    var imaginary = (num1.real * num2.imaginary) + (num1.imaginary * num2.real);
    return display_complex(real, imaginary);
  }
  
  function complex_num_div(first, second) {
    var num1, num2;
    num1 = Complex.transform(first);
    num2 = Complex.transform(second);
    let a = num1.real;
        b = num1.imaginary;
        c = num2.real;
        d = num2.imaginary;
    var real = (a * c + b * d) / (c * c + d * d);
    var imaginary = (b * c - a * d) / (c * c + d * d);
    return display_complex(real, imaginary);
  }
  var a = new Complex(7, 12);
  var b = new Complex(14, 24);
  console.log("Addition : ", complex_num_add(a, b)); //(21 + 36i)
  var n1 = new Complex(10, 6);
  var n2 = new Complex(4, 2);
  console.log("Substraction : ", complex_num_sub(n1, n2));  //(6 + 4i)
  var n = new Complex(3, 2);
  var m = new Complex(4, 5);
  console.log("Multiplication : ", complex_num_mul(n, m));  //(2 + 23i)
  var x = new Complex(4, 7);
  var y = new Complex(1, -3);
  console.log("Division : ", complex_num_div(x, y));   //(-1.7 + 1.9i)
  
  