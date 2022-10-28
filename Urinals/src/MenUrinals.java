public class MenUrinals {

    public void openFile()
    {

    }

    public Integer countUrinals(String st)
    {
        System.out.println("Implementation is not yet completed");
        return 0;
    }

    public String getString()
    {

        return null;
    }

    public Boolean goodString(String st)
    {
        //System.out.println("Implemention is not yet complete");
        for (int i = 0; i < st.length(); i++)
        {
            if (st.charAt(i) != '0' && st.charAt(i) != '1')
            {
                return false;
            }
            int j=i+1;
            if (j< st.length())
            {
                if (st.charAt(i) == '1' && st.charAt(j) == '1')
                    return false;
            }

        }
        return true;
    }


}
