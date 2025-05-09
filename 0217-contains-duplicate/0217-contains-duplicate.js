/**
 * @param {number[]} nums
 * @return {boolean}
 */
var containsDuplicate = function(nums) {
    const a=new Set(nums);
    const b=[...a];

    if(nums.length===b.length)
    {
        return false;
    }
    else{
        return true;
    }


    
};