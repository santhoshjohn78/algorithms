package arrays;

public class SubArrayWithSum {

    public void isSumPresent(Integer[] arr,final Integer sum){

        int cur_sum = 0;
        int begin = 0;
        int end = 1;
        cur_sum = arr[begin] + arr[end];
        while (end < arr.length) {
            if (cur_sum < sum) { // append from end
                end++;
                if (end >= arr.length) {
                    break;
                }
                cur_sum += arr[end];
            } else if (cur_sum > sum) { // trim from beginning
                cur_sum -= arr[begin];
                begin++;
            } else { // same
                System.out.println((begin + 1) + " " + (end + 1));
                StringBuffer stringBuffer=new StringBuffer();
                for(int i=begin;i<=end;i++){
                    stringBuffer.append(""+arr[i]);
                    if (i<end){
                        stringBuffer.append(" + ");
                    }
                }
                stringBuffer.append(" = "+cur_sum);
                System.out.print(stringBuffer.toString());
                return;
            }
        }
        System.out.println("-1");



    }

    public static void main(String[] args){
        SubArrayWithSum sub = new SubArrayWithSum();
        Integer inp[] = {1,2,3,7,5};
        sub.isSumPresent(inp,12);
    }
}
