package com.leetcode.quiz;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArrayStudy {
    /**
     * @Description: 现有数组a = [3,1,4,6,2]实现冒泡排序
     **/
    public static int[] bubbleSort(int[] ints){
        //一共要PK的轮次
        for(int m=0; m<ints.length-1; m++){
            //每轮PK时，比较大小次数
            for(int i=0; i<ints.length-1-m; i++){
                if( ints[i] > ints[i+1]){
                    int temp = ints[i];
                    ints[i] = ints[i+1];
                    ints[i+1] = temp;
                }
            }
        }
        return ints;
    }

    //给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
    //请必须使用时间复杂度为 O(log n) 的算法。
    //输入: nums = [1,3,5,6], target = 5   输出: 2
    //输入: nums = [1,3,5,6], target = 2   输出: 1
    public static int searchInsert(int[] nums, int target){
        if(target > nums[nums.length-1]){
            return nums.length;
        }
        for(int i = 0; i< nums.length; i++){
            if(target <= nums[i]){
                return i;
            }
        }
        return 0;
    }

    //给你两个按 非递减顺序 排列的整数数组 nums1 和 nums2，另有两个整数 m 和 n ，分别表示 nums1 和 nums2 中的元素数目。
    //请你 合并 nums2 到 nums1 中，使合并后的数组同样按 非递减顺序 排列。
    //输入：nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3    输出：[1,2,2,3,5,6]
    public static void merge(int[] nums1, int m, int[] nums2, int n){
        for(int i=0; i != n; ++i){
            nums1[m+i] = nums2[i];
        }
        Arrays.sort(nums1);

        for(int j = 0; j<nums1.length; j++){
            System.out.println(nums1[j]);
        }
    }

    /*整数数组 nums 按升序排列，数组中的值 互不相同 。
    在传递给函数之前，nums 在预先未知的某个下标 k（0 <= k < nums.length）上进行了旋转，
    使数组变为 [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]]（下标 从 0 开始 计数）。
    例如，[0,1,2,4,5,6,7] 在下标 3 处经旋转后可能变为 [4,5,6,7,0,1,2] */
    //给你旋转后的数组 nums 和一个整数 target ，如果 nums 中存在这个目标值 target ，则返回它的下标，否则返回 -1 
    //输入：nums = [4,5,6,7,0,1,2], target = 0   输出：4
    //输入：nums = [4,5,6,7,0,1,2], target = 3   输出：-1
    //输入：nums = [1], target = 0               输出：-1
    public static int search(int[] nums, int target){
        int n = nums.length;
        if(n == 0){
            return  -1;
        }
        if(n == 1){
            return nums[0] == target ? 0 : -1;
        }
        int l = 0, r = n-1;
        while(l<=r ){
            int mid = (l + r)/2;
            if(nums[mid] == target){
                return mid;
            }
            if(nums[0] <= nums[mid]){
                if(nums[0] <= target && target <nums[mid]){
                    r = mid - 1;
                }else {
                    l = mid + 1;
                }
            } else {
                if(nums[mid] < target && target <=nums[n-1]){
                    l = mid+1;
                }else {
                    r = mid-1;
                }
            }
        }
        return -1;
    }

    //给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。
    //如果数组中不存在目标值 target，返回 [-1, -1]。
    //输入：nums = [5,7,7,8,8,10], target = 8    输出：[3,4]
    //输入：nums = [5,7,7,8,8,10], target = 6    输出：[-1,-1]
    //输入：nums = [], target = 0                输出：[-1,-1]
    public static int[] searchRange(int[] nums, int target){
        if(nums == null || nums.length == 0) return new int[]{-1,-1};//边界
        int l = 0, r = nums.length-1;//左右指针
        while (l<=r){//优先考虑等号，例如只有一个元素，必须加等号
            int mid = (l+r)/2;
            if(nums[mid] > target){
                r=mid-1;
            }else if(nums[mid] < target){
                l=mid+1;
            }else {
                //这里不用循环，而采用逐步逼近
                if(nums[l]==target && nums[r] == target ) return new int[]{l,r};
                if(nums[l] != target) l++;
                if(nums[r] != target) r--;
            }
        }
        ////没找到返回-1 -1
        return new int[]{-1,-1};
    }


    //给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
    //你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。你可以按任意顺序返回答案。
    //示例 1：输入：nums = [2,7,11,15], target = 9  输出：[0,1]
    //解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1]
    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for(int i=0; i < n; ++i){
            for(int j= i+1; j<n; ++j){
                if(nums[i]+nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[0];
    }

    public static int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> hashtable = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; ++i) {
            if (hashtable.containsKey(target - nums[i])) {
                return new int[]{hashtable.get(target - nums[i]), i};
            }
            hashtable.put(nums[i], i);
        }
        return new int[0];
    }

    //给定一个由N个整数组成的数组A，返回A中未出现的最小正整数（大于0）。
    //例如，给定A=[1,3,6,4,1,2]，函数应该返回5。
    //给定A=[1，2，3]，函数应该返回4。
    //给定A=[−1，−3] ，函数应返回1。
    public static int minPositive(int[] A) {
        Arrays.sort(A);
        int max = A[A.length-1];
        int i = 1;
        if( max>0 ){
            while (i<A.length){
                if((A[i]-A[i-1])<=1){
                    if (A[i] == max)
                        return max+1;
                    else
                        i=i+1;
                }
                if((A[i]-A[i-1])>=2)
                    return (A[i-1]+1);
            }
        }
        return 1;
    }

    //给出了一个由N个整数组成的数组A。数组的旋转意味着每个元素右移一个索引，数组的最后一个元素移到第一位。
    //例如，数组A=[3,8,9,7,6]的旋转为[6,3,8,9,7]（元素向右移动一个索引，6移动到第一位）。
    //目标是将数组旋转K次；也就是说，A的每个元素都将向右移动K次。
    public static int[] CyclicRotation(int[] A, int K) {
        for(int i=1;i<=K;i++){
            A=moveOneStep(A);
        }
        return A;
    }
    //数组往右移动一位
    public static int[] moveOneStep(int[] array){
        int last=array[array.length-1];
        for (int i=array.length-2;i>=0;i--){
            array[i+1]=array[i];
        }
        array[0]=last;
        return array;
    }

    //给出了一个由N个整数组成的非空数组A。数组包含奇数个元素，数组中的每个元素都可以与具有相同值的另一个元素配对，只有一个元素未配对。
    //给定一个由满足上述条件的N个整数组成的数组A，返回未配对元素的值。
    //例如，给定一个数组，使得：
    //A[0]=9 A[1]=3 A[2]=9 A[3]=3 A[4]=9 A[5]=7 A[6]=9      该函数应返回7
    public static int OddOccurrencesInArray(int[] A) {
        //创建一个位图 初始全是0 配对之后，改成1
        int[] bytePic=new int[A.length];
        for(int i=0;i<A.length;i++){
            for(int j=i+1;j<A.length;j++){
                //如果已经被匹配过，就跳过
                if(bytePic[i]==1){
                    continue;
                }else {
                    if (A[i]==A[j]){
                        //设置位图
                        bytePic[i]=1;
                        bytePic[j]=1;
                        //第一次找到就退出本次循环
                        break;
                    }
                }
            }
        }

        //找到位图中仅存的 0
        int index=-1;
        for (int i=0;i<bytePic.length;i++){
            if (bytePic[i]==0){
                index=i;
            }
        }
        return A[index];
    }

    public static void main(String[] args) {

        /*//现有数组a = [3,1,4,6,2]实现冒泡排序
        int[] ints = bubbleSort( new int[]{3,1,4,6,2} );
        for (int i=0; i<ints.length; i++){
            System.out.println(ints[i]);
        }*/

        /*int[] nums = {1,3,5,6};
        int target = 5;
        System.out.println(searchInsert(nums, target));*/

        /*int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        //输出：[1,2,2,3,5,6]
        merge(nums1,m,nums2,n);*/

        /*//int[] nums = {1};
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;   //输出：4
        System.out.println(search(nums, target));*/

        /*int[] nums = {};
        //int[] nums = {5,7,7,8,8,10};
        int target = 8;
        int[] range = searchRange(nums,target);
        System.out.println("["+range[0]+","+range[1]+"]");*/

        /*int[] nums = {2,7,11,15};
        int target = 9;
        int[] res = twoSum(nums,target);
        //int[] res = twoSum2(nums,target);
        for(int i = 0; i<res.length;i++){
            System.out.println(res[i]);
        }*/

        /*int[] A = {1, 3, 6, 4, 1, 2};
        int res = minPositive(A);
        System.out.println(res);*/

        /*int[] A = {3,8,9,7,6};
        int[] res = CyclicRotation(A,1);
        for(int i = 0;i<res.length;i++){
            System.out.println(res[i]);
        }*/

        /*int[] A = {9,3,9,3,9,7,9};
        int res = OddOccurrencesInArray(A);
        System.out.println(res);*/

    }

}
