// ================= LC1 – Number Based Problems =================

// Activity 1: Prime Number
class A1_Prime {
    public static void main(String[] args) {
        int n = 17;
        boolean prime = true;
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                prime = false;
                break;
            }
        }
        System.out.println(prime ? "Prime" : "Not Prime");
    }
}

// Activity 2: Reverse Number
class A2_Reverse {
    public static void main(String[] args) {
        int n = 1234, rev = 0;
        while (n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        System.out.println(rev);
    }
}

// Activity 3: Armstrong
class A3_Armstrong {
    public static void main(String[] args) {
        int n = 153, sum = 0, temp = n;
        while (temp > 0) {
            int d = temp % 10;
            sum += d*d*d;
            temp /= 10;
        }
        System.out.println(sum == n ? "Armstrong" : "Not");
    }
}

// Activity 4: Palindrome Number
class A4_Palindrome {
    public static void main(String[] args) {
        int n = 121, rev = 0, temp = n;
        while (temp > 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }
        System.out.println(rev == n ? "Palindrome" : "Not");
    }
}

// Activity 5: Factorial
class A5_Factorial {
    public static void main(String[] args) {
        int n = 5, fact = 1;
        for (int i = 1; i <= n; i++) fact *= i;
        System.out.println(fact);
    }
}


// ================= LC2 – Loop Based Problems =================

// Activity 1: Print 1 to N
class B1_Print {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) System.out.print(i + " ");
    }
}

// Activity 2: Sum of N
class B2_Sum {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 10; i++) sum += i;
        System.out.println(sum);
    }
}

// Activity 3: Table
class B3_Table {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= 10; i++)
            System.out.println(n + " x " + i + " = " + (n*i));
    }
}

// Activity 4: Fibonacci
class B4_Fibo {
    public static void main(String[] args) {
        int a = 0, b = 1;
        for (int i = 0; i < 10; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }
}

// Activity 5: Star Pattern
class B5_Pattern {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print("* ");
            System.out.println();
        }
    }
}


// ================= LC3 – Array Based Problems =================

// Activity 1: Sum of Array
class C1_ArraySum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int sum = 0;
        for (int x : arr) sum += x;
        System.out.println(sum);
    }
}

// Activity 2: Max Element
class C2_Max {
    public static void main(String[] args) {
        int[] arr = {3,7,2,9,1};
        int max = arr[0];
        for (int x : arr) if (x > max) max = x;
        System.out.println(max);
    }
}

// Activity 3: Reverse Array
class C3_Reverse {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        for (int i = arr.length-1; i >= 0; i--)
            System.out.print(arr[i] + " ");
    }
}

// Activity 4: Linear Search
class C4_Search {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int key = 3;
        boolean found = false;
        for (int x : arr) if (x == key) found = true;
        System.out.println(found ? "Found" : "Not Found");
    }
}

// Activity 5: Count Even
class C5_Even {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6};
        int count = 0;
        for (int x : arr) if (x % 2 == 0) count++;
        System.out.println(count);
    }
}


// ================= LC4 – String Based Problems =================

// Activity 1: Reverse String
class D1_ReverseStr {
    public static void main(String[] args) {
        String s = "hello";
        String rev = "";
        for (int i = s.length()-1; i >= 0; i--)
            rev += s.charAt(i);
        System.out.println(rev);
    }
}

// Activity 2: Palindrome String
class D2_PalinStr {
    public static void main(String[] args) {
        String s = "madam";
        String rev = new StringBuilder(s).reverse().toString();
        System.out.println(s.equals(rev) ? "Palindrome" : "Not");
    }
}

// Activity 3: Count Vowels
class D3_Vowels {
    public static void main(String[] args) {
        String s = "hello";
        int count = 0;
        for (char c : s.toCharArray())
            if ("aeiou".indexOf(c) != -1) count++;
        System.out.println(count);
    }
}

// Activity 4: Length
class D4_Length {
    public static void main(String[] args) {
        String s = "hello";
        System.out.println(s.length());
    }
}

// Activity 5: Uppercase
class D5_Upper {
    public static void main(String[] args) {
        String s = "hello";
        System.out.println(s.toUpperCase());
    }
}


// ================= LC5 – Sorting & Searching =================

// Activity 1: Bubble Sort
class E1_Bubble {
    public static void main(String[] args) {
        int[] arr = {5,3,2,4,1};
        for (int i = 0; i < arr.length-1; i++)
            for (int j = 0; j < arr.length-i-1; j++)
                if (arr[j] > arr[j+1]) {
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
        for (int x : arr) System.out.print(x + " ");
    }
}

// Activity 2: Selection Sort
class E2_Selection {
    public static void main(String[] args) {
        int[] arr = {5,3,2,4,1};
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i+1; j < arr.length; j++)
                if (arr[j] < arr[min]) min = j;
            int t = arr[i];
            arr[i] = arr[min];
            arr[min] = t;
        }
        for (int x : arr) System.out.print(x + " ");
    }
}

// Activity 3: Binary Search
class E3_Binary {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int key = 3, l = 0, r = arr.length-1;
        while (l <= r) {
            int m = (l+r)/2;
            if (arr[m] == key) {
                System.out.println("Found");
                return;
            } else if (arr[m] < key) l = m+1;
            else r = m-1;
        }
        System.out.println("Not Found");
    }
}

// Activity 4: Insertion Sort
class E4_Insertion {
    public static void main(String[] args) {
        int[] arr = {5,3,2,4,1};
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i], j = i-1;
            while (j >= 0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        for (int x : arr) System.out.print(x + " ");
    }
}

// Activity 5: Linear Search
class E5_Linear {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int key = 2;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Found at index " + i);
                return;
            }
        }
        System.out.println("Not Found");
    }
}
