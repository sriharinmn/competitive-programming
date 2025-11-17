public static String moveHyphensToFront(String s) {
    StringBuilder hyphens = new StringBuilder();
    StringBuilder others = new StringBuilder();

    for (char c : s.toCharArray()) {
        if (c == '-') hyphens.append(c);
        else others.append(c);
    }

    return hyphens.append(others).toString();
}
