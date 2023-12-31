package Exception.handling;

public class Example {
    int count = 0;

    void A() throws Exception
    {
        try
        {
            count++;

            try
            {
                count++;

                try
                {
                    count++;
                    throw new Exception();

                }

                catch(Exception ex)
                {
                    count++;
                    throw new Exception();
                }
            }

            catch(Exception ex)
            {
                count++;
            }
        }

        catch(Exception ex)
        {
            count++;
        }

    }

    void display()
    {
        System.out.println(count);
    }

    public static void main(String[] args) throws Exception
    {
        Example obj = new Example();
        obj.A();
        obj.display();
    }
    }



