public class removeDuplicate {
    public static void removeduplicate(String str, int idx, StringBuilder newStr, boolean map[]) {
        if(idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        if(map[currChar - 'a'] == true) {
            removeduplicate(str, idx + 1, newStr, map);
        } else {
            map[currChar - 'a'] = true;
            newStr.append(currChar);
            removeduplicate(str, idx + 1, newStr, map);
        }
    }

    public static int friendsPairing(int n) {
        int fnm1 = friendsPairing(n - 1);
        int fnm2 = friendsPairing(n - 2);
        return fnm1 + (n - 1) * fnm2;
    }

    public static void main(String args[]) {
        String str = "appnnacollege";
        removeduplicate(str, 0, new StringBuilder(""), new boolean[26]);
        friendsPairing(10);
    }
}
