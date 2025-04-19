/**
 * @param {number[]} nums1
 * @param {number[]} nums2
 * @return {number}
 */
var findMedianSortedArrays = function(nums1, nums2) {
    const a=nums1.concat(nums2)
     a.sort((x, y) => x - y); 
    const b=a.length;
    if(b%2!=0){
        return a[Math.floor(b/2)];

    }
    else{
         const mid1 = a[b / 2 - 1];
        const mid2 = a[b / 2];
        return (mid1 + mid2) / 2; 
    }
    
};