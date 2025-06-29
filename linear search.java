Scanner sc = new Scanner(System.in);
    System.out.println("Enter an Element: ");
    int value = sc.nextInt();
    boolean found = false;
    for(int i=0; i<arr.length; i++)
    {
        for(int j=0; j<arr[i].length; j++)
        {
            if(value == arr[i][j])
            {
            
                System.out.println("Element Found at position: "+i+","+j);
                found = true;
            }
        }
    }
    if(!found)
    {
        System.out.println("The element is not Found");
    }
