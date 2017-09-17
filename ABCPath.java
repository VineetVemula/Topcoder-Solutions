public class ABCPath
{
  int max=0;

  public int length(String[] grid)
  {
    int i,j,res=0;
    int len= grid.length;
    int wid=grid[0].length();
    char [][] a = new char[len][wid];
    for(i=0;i<len;i++)
    {
      for(j=0;j<wid;j++)
      {
        a[i][j]=grid[i].charAt(j);
      }
    }

    for(i=0;i<len;i++)
    {
      for(j=0;j<wid;j++)
      {
        if(a[i][j]=='A')
        {
          findlength(a,i,j,1,len,wid);
        }
      }
    }
    return max;

  }

  public void findlength(char a[][],int u,int m,int c,int l,int w)
  {
    int v=(int) a[u][m];
    v++;
    char x=(char)v;
    for(int i=-1;i<2;i++)
    {
      for(int j=-1;j<2;j++)
      {
        if(i==0 && j==0)
        {
          continue;
        }
        if((u+i)<0 || (m+j)<0 || (u+i)>=l || (m+j)>=w)
        {
          continue;
        }
        if(a[u+i][m+j]== x)
        {
          findlength(a,u+i,m+j,c+1,l,w);
        }
      }
    }
    if(max<c)
    {
      max=c;
    }
  }


  public static void main(String args[])
  {
    ABCPath c= new ABCPath();
    String[] grid={ "AMNOPA", "ALEFQR", "KDABGS", "AJCHUT", "AAIWVA", "AZYXAA" };
    int res=c.length(grid);
    System.out.println(res);
  }
}
