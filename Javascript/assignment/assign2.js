let N=String(prompt("Enter The Name"));

console.log(N.toUpperCase());
console.log(N.length);

console.log(N.slice(-N.length,-N.length+1));
console.log(N.slice(N.length-1));



let str1=String(prompt("enter the String"));
console.log(str1.slice(-str1.length-1,-str1.length+5));
console.log(str1.slice(str1.length-3));


let email1=String(prompt("enter the email"));
let a=Boolean(email1.includes('@'));
let b=Boolean(email1.includes('.'))
if(a==true & b==true){
    console.log("Valid");   
}
else{
    console.log("Invalid");
    
}