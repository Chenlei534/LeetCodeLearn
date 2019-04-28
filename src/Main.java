public class Main {

    public static void main(String[] args) {

        int[] nums=new int[]{2, 7, 11, 15};
        int target=9;
        int[] result;
        SumOfTwoNumbers sotn=new SumOfTwoNumbers();
        result=sotn.twoSumViolence(nums,target);
        System.out.println(result[0]+","+result[1]);
    }
}
