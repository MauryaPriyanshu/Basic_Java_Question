import java.util.*;
public class StackDemo{
public static void main(String[] args){

Stack<String> st = new Stack<String>();

st.push("mango");
st.push("papaya");
st.push("apple");
st.push("orange");
st.push("pineapple");
st.push("banana");

st.pop();

System.out.println(st);
}
}