var l = [1, 2, [3, 4, [5, 6]], 7, 8, [9, [10]]];
function removeNesting(l){
    let output = [];
    for (const i in l) {
        if(Array.isArray(l[i]))
            output = output.concat(removeNesting(l[i]));
        else
            output.push(l[i]);  
    }
    return output;
}

console.log("List after removed nesting : ",removeNesting(l));
