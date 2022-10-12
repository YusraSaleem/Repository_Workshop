class Fibonacci {

public static void main (String[] args) {

long next = 1;
long first = 0;
long sum;

System.out.print(0+"    ");

for(int i=0;i<10;i++) {

sum = first + next;
first = next;
next = sum;

System.out.print(first+"    ");

}

}
}