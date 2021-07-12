function caesarShift(str, key, dir) {
    if (key < 0) {
        return caesarShift(str, key + 26);
    }

    var output = "";
    for (var i = 0; i < str.length; i++) {

        var c = str[i];

        if (c.match(/[a-z]/i)) {
            var code = str.charCodeAt(i);
            if (dir == "encrypt"){
                if (code >= 65 && code <= 90) {
                    c = String.fromCharCode(((code - 65 + key) % 26) + 65);
                } else if (code >= 97 && code <= 122) {
                    c = String.fromCharCode(((code - 97 + key) % 26) + 97);
                }
            }else{
                if (code >= 65 && code <= 90) {
                    c = String.fromCharCode(((code - 65 - key) % 26) + 65);
                } else if (code >= 97 && code <= 122) {
                    c = String.fromCharCode(((code - 97 - key) % 26) + 97);
                }
            }            
        }
        output += c;
    }
    return output;
}

console.log("Encrypt Text : " + caesarShift("GOOD MORNING", 5, "encrypt"));
console.log("Decrypt Text : " + caesarShift("LTTI RTWSNSL", 5, "decrypt"));


//        using map and reduce 

const str = 'javascript';
const getMap = (legend, shift) => {
   return legend.reduce((charsMap, currentChar, charIndex) => {
      const copy = { ...charsMap };
      let ind = (charIndex + shift) % legend.length;
      if (ind < 0) {
         ind += legend.length;
      };
      copy[currentChar] = legend[ind];
      return copy;
   }, {});
};
const encrypt = (str, shift = 0) => {
   const legend = 'abcdefghijklmnopqrstuvwxyz'.split('');
   const map = getMap(legend, shift);
   return str.toLowerCase().split('').map(char => map[char] || char).join('');
};

console.log("Encrypt Text : ",encrypt(str, 4));

const str1 = 'nezewgvmtx';
const getMap1 = (legend, shift) => {
   return legend.reduce((charsMap, currentChar, charIndex) => {
      const copy = { ...charsMap };
      let ind = (charIndex - shift) % legend.length;
      if (ind < 0) {
         ind += legend.length;
      };
      copy[currentChar] = legend[ind];
      return copy;
   }, {});
};
const decrypt = (str, shift = 0) => {
   const legend = 'abcdefghijklmnopqrstuvwxyz'.split('');
   const map = getMap1(legend, shift);
   return str.toLowerCase().split('').map(char => map[char] || char).join('');
};

console.log("Decrypt Text : ",decrypt(str1, 4));



