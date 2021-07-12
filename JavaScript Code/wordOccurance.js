function occurance(str, word){
    return str.split(word).length-1;
}

function wordOccurance(str){
    const strArray = str.split(" ");
    //console.log(strArray);
    const uniqeArray = new Array();
    for(let item in strArray){
        //console.log(strArray[item]);
        if(uniqeArray.includes(strArray[item]) == false)
            uniqeArray.push(strArray[item]);
    }
  //  console.log(uniqeArray);
    for(let s in uniqeArray)
    {
        console.log("Count of '" + uniqeArray[s] + "' : " + occurance(str,uniqeArray[s]));
    }    
    return 0;
}

//wordOccurance("Good things come to those who wait");
wordOccurance("Give someone the benifit of the doubt");
//console.log(occurance("The world of Programming. world .. world", "world"));