/**
 * @param {string} s
 * @return {number}
 */
var lengthOfLastWord = function(s) {
    const c = s.trim();

    const d=c.split("").reverse().join("");
    const b = d.split(" ")[0];
   

    return b.length;
 

    
};