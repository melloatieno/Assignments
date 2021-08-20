package Week4;

public class Recursion {
    public int strCount(String txt, String key)
    {
        //Base condition (Exit condition)
        if (!txt.contains(key) || txt.isEmpty())
            return 0;
        //Actual task
        if (txt.substring(0, key.length()).equals(key))
        {
            return 1 + strCount(txt.substring(key.length()), key);
        }
        else
            //gets rid of the first character if the first substring doesn't match the key
           return strCount(txt = txt.substring(1), key);
    }

    public int xCount(String str)
    {
        if (str.isEmpty()) //base condition (checks if the string is empty)
            return 0;
        //actual work
        if (str.charAt(0) == 'x')
            return 1 + xCount(str.substring(1));
        return xCount(str.substring(1));
    }

    public int blocks(int rows)
    {
        if (rows == 0)
            return 0;
        return rows + blocks(rows - 1);
    }

    public String parent(String str) {
        if (!str.substring(0, 1).equals("("))
            return parent(str.substring(1));
        return (str.substring(0, str.indexOf(")") + 1));
    }
}
