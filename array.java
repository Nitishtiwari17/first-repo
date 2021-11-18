

class array 
 {
     public static void main(String args[])
     {
         //type of create array;
     //1.Declare + initialize
     //int [] marks={100,70,80,71,98};
     //marks=new int[5];
    // System.out.println(marks[4]);
    //2.Declaration and memory allocation;
   // int [] marks=new int[5];
   // marks[0]=98;
    //marks[1]=100;
    //marks[2]=88;
    //marks[3]=78;
    //marks[4]=89;
    //System.out.println(marks[4]);
    //method 3 first declaration and than memeory allocation;
    /*int [] marks;
    marks=new int[5];
    marks[0]=98;
    marks[1]=88;
    marks[2]=100;
    System.out.println(marks[0]); */
   // int [] marks={100,98,88,78,56};
    /*for(int i=marks.length-1;i>=0;i--)
    {
        System.out.println(marks[i]);
    }*/
    /*for each loop;
    {
        System.out.println(element);
    }*/
    /*int [][] flats=new int[2][3];
    flats[0][0]=101;
    flats[0][1]=102;
    flats[0][2]=103;
    flats[1][0]=201;
    flats[1][1]=202;
    flats[1][2]=203;
    for(int i=0;i<flats.length;i++){
        for(int j=0;j<flats[i].length;j++)
        {
           System.out.print(flats[i][j]);
          System.out.print("  ");



           
          
           
        }
        System.out.print("");
    }*/
    //question 1;
    //float sum=0;
   // float [] marks=new float[5];
   // marks[0]=90.0f;
   // marks[1]=80.5f;
   // marks[2]=70.8f;
   // marks[3]=60.9f;
   // marks[4]=50.9f;
   // for(float element:marks)
   // {
       // sum=sum+element;
        //System.out.println("total sum is:"+sum);
   // }
    //float sum=marks[0]+marks[1]+marks[2]+marks[3]+marks[4];
       // System.out.println(sum);


       //question 2;
      /* float [] marks={100.8f,1108.8f,200.5f,220.5f};
       float num=100.9f;
       boolean isInArray=false;
       for(float element:marks)
       {
           if( num==element)
           {
               isInArray=true;
               
               
           }
           if(isInArray)
           {
               System.out.println("the value is present in the array");
           }
           else
        //   {
             //  System.out.println("the value  is not present in the arrya");
         //  }
      // } */
         
    float [] marks={100.0f,200.5f,300.8f,400.9f,500.5f,600.6f};
    float sum=0;
    for(float element:marks)
    {
        sum=sum+element;
        System.out.println("total sum is:"+sum/marks.length);
}
 }
}
