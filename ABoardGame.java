public class ABoardGame
{
  public static String whoWins(String[] board)
  {
    int a=0,b=0,n,i,j,k;
    int m = board.length;
    n=m/2;
    m=m-1;
    n=n-1;
    for(i=n;i>=0;i--)
    {
      for(j=n;j<=m-n;j++)
      {
        for(k=n;k<=m-n;k++)
        {
          if((j==n)||(j==m-n)||(k==n)||(k==m-n))
          {
            if(board[j].charAt(k)=='A')
              a++;
            if(board[j].charAt(k)=='B')
              b++;

          }
        }
      }
      if(a>b)
        return ("Alice");
      if(b>a)
        return ("Bob");
      n--;
      a=0;
      b=0;
    }
  return ("Draw");
  }

  public static void main(String[] args)
  {
    String[] s = {"..A..AAA..AA", "ABABB..AAAAA", "ABBBBBBBBBA.", "AABBBABABBAA", "...BABABABBA", "B.BA..A.BBA.", "AA.A..B.AB.B", "..BA.B.AABAA", "..ABABBBABA.", ".ABB.BBBBBAA", "ABAAA.AA.A.A", "A..AAA.AAA.A"};
    String y=whoWins(s);
    System.out.println(y);
  }
}
