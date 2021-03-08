public class ProblemSet12 {
        public long factorial(int n) {
        if (n > 2) {
            n *= factorial(n - 1);
        }
        if (n < 1) {
            return -1;
        }

        return n;
    }

    public long fibonacci(int n) {
        if (n == 2) {
            return 1;
        }
        if (n > 2) {
            n += fibonacci(n - 1) + fibonacci(n - 2);
        }
        if (n < 0) {
            return -1;
        }
        return n;
    }

    public long triangle(int rows) {
        if (rows > 2) {
            rows += triangle(rows - 1);
        }
        if (rows < 1) {
            return -1;
        }

        return rows;
    }

    public long sumDigits(int n) {
        long sum = 0;
        if (n > 0) {
            sum += n % 10;
            sum += sumDigits(n / 10);
        }
        if (n < 0) {
            return -1;
        }
        return sum;
    }

    public long powerN(int base, int exponent) {
        if (exponent > 1) {
            base *= powerN(base, exponent - 1);
        }
        if (base < 1 || exponent < 1) {
            return -1;
        }
        return base;
    }

    public String changeXY(String text) {
        if (text == null) {
            return null;
        }
        if (text.length() > 0) {
            if (text.startsWith("x")) {

                text = "y".concat(changeXY(text.substring(1)));
            } else {
                text = String.valueOf(text.charAt(0)).concat(changeXY(text.substring(1)));
            }
        }
        return text;
    }

    public int array11(int[] data, int index) {
        if (data == null || index < 0 || index >= data.length) {
            return -1;
        }
        int count = 0;
        if (data[index] == 11) {
            count++;
        }
        if (index == data.length - 1) {
            return count;
        }
        count += array11(data, ++index);
        return count;
    }

    public int strCount(String text, String sub) {
        if (text == null || sub == null || sub.length() == 0) {
            return -1;
        }
        if (text.length() - sub.length() < 0) {
            return 0;
        }
        int count = 0;
        int next = 1;
        if (text.startsWith(sub)) {
            count++;
            next = sub.length();
        }

        return count + strCount(text.substring(next), sub);
    }

    public boolean strCopies(String text, String sub, int n) {
        if (n < 0) {
            return false;
        }
        return strCount(text, sub) == n;
    }

    public int strDist(String text, String sub) {
        if (text == null || sub == null || sub.length() == 0) {
            return -1;
        }
        return lastIndex(text.length(), text, sub) - firstIndex(0, text, sub);
    }

    public int firstIndex(int index, String text, String sub) {
        if (sub.length() > text.length()) {
            return 0;
        }
        System.out.println(index);
        if (text.startsWith(sub)) {
            return index;
        }
        index++;
        return firstIndex(index, text.substring(1), sub);
    }

    public int lastIndex(int index, String text, String sub) {
        if (sub.length() > text.length()) {
            return 0;
        }
        System.out.println(index);
        if (text.endsWith(sub)) {
            return index;
        }
        System.out.println();
        return firstIndex(index - 2, text.substring(0, text.length()-2), sub);
    }
}
