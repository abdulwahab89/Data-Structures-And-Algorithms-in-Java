public class RPN {
    public RPN(String[] arr) {
        Stack stack = new ArrayStack(arr.length);
        for (int i = 0; i < arr.length; i++) {
            String input = arr[i];
            if (isAnOperation(input)) {
                double y = Double.parseDouble((String) stack.pop());
                double x = Double.parseDouble((String) stack.pop());
                double z = evaluate(x, y, input);
                stack.push((" " + z));
            }
            else
                stack.push(input);
        }

    }

    private double evaluate(double x, double y, String input) {

        double z =0;
        if(input.equals("A")) z=x+y;
        else if(input.equals("S")) z=x-y;
        else if(input.equals("M")) z=x*y;
        else z=x/y;
        System.out.println(x+" "+input+" "+y+" = "+z);
        return z;



    }

    private boolean isAnOperation(String input) {
        return(input.length()==1 && "ASMD".indexOf(input)>=0);
    }
}

//postfix