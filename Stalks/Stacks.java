import java.util.Stack;
public class Stacks {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();//object of stack created
        System.out.println("Stack Size:"+st.size());
        System.out.println(st);
        System.out.println("");

        st.push(1);
        st.push(23);
        st.push(90);
        st.push(5);
        st.push(34);
        System.out.println(st);
        System.out.println("Stsck Size:"+st.size());
       
        while (st.size() > 1) { //check the first element
//            System.out.println("Last element in stack:"+st.peek());//show last element
//            System.out.println("pop:"+st.pop());//remove top most element
            st.pop();            
        }
        System.out.println("First Element:"+st.peek());
    }
}