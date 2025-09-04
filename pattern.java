public class pattern {
    int row = 16;
    int col = 15;

    static char bound[][];
    public void board(){

        char p = 35; //ascii value of hashtag
        char q = 46; //ascii value of dot
        bound = new char[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(i==0 && j>=0 && j<=14){
                    bound[i][j]=p;
                } else if (j==0 && i>=1 && j<=15 ) {
                    bound[i][j]=p;
                }
                else if (j==14 && i>=1 && j<=15 ) {
                    bound[i][j]=p;
                }
                else if(i==15 && j>=1 && j<=13){
                    bound[i][j]=p;
                }
                else if ((i==2 && j==4)||(i==2 && j==11)){
                    bound[i][j]=p;
                }
                else if (i==3 && j>=4 && j<=11){
                    bound[i][j]=p;
                }
                else if (i==4 && j==2){
                    bound[i][j]=p;
                }
                else if ((i==5 && j==2)||(i==5 && j==12)||(i==5 && j>=4 && j<=5)||(i==5 && j>=7 && j<=9)){
                    bound[i][j]=p;
                }
                else if ((i==6 && j==2)||(i==6 && j==5)||(i==6 && j==9)||(i==6 && j==12)){
                    bound[i][j]=p;
                }
                else if ((i==7 && j==2)||(i==7 && j==5)||(i==7 && j==9)||(i==7 && j==12)){
                    bound[i][j]=p;
                }
                else if ((i==8 && j==2)||(i==8 && j==5)||(i==8 && j==9)||(i==8 && j==12)){
                    bound[i][j]=p;
                }
                else if ((i==9 && j==2)||(i==9 && j>=6 && j<=7)||(i==9 && j==9)||(i==9 && j==12)){
                    bound[i][j]=p;
                }
                else if ((i==10 && j==2)||(i==10 && j==7)||(i==10 && j==12)){
                    bound[i][j]=p;
                }
                else if ((i==11 && j==2)||(i==11 && j==4)||(i==11 && j>=7 && j<=8)||(i==11 && j==12)){
                    bound[i][j]=p;
                }
                else if ((i==12 && j==4)||(i==12 && j>=8 && j<=10)){
                    bound[i][j]=p;
                }
                else if ((i==13 && j>=4 && j<=6)){
                    bound[i][j]=p;
                }
                else {
                    bound[i][j]=q;
                }
            }

        }
    }

    public void draw() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(bound[i][j] + " ");

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern p = new pattern();
        p.board();
        p.draw();
    }
    /* if(Board.bound[this.coordinates.x][this.coordinates.y]=='#'){
            //PacMan_Hurdle_lives=PacMan_Hurdle_lives-1;
            if(Board.bound[this.coordinates.x+1][this.coordinates.y]==' '){
                Board.bound[this.coordinates.x][this.coordinates.y]='#';
                this.coordinates.x=this.coordinates.x+1;
                Board.bound[this.coordinates.x][this.coordinates.y]=this.pacman_name;
            }else if(Board.bound[this.coordinates.x][this.coordinates.y+1]==' '){
                Board.bound[this.coordinates.x][this.coordinates.y]='#';
                this.coordinates.x=this.coordinates.y+1;
                Board.bound[this.coordinates.x][this.coordinates.y]=this.pacman_name;
            }else if(Board.bound[this.coordinates.x-1][this.coordinates.y]==' '){
                Board.bound[this.coordinates.x][this.coordinates.y]='#';
                this.coordinates.x=this.coordinates.x-1;
                Board.bound[this.coordinates.x][this.coordinates.y]=this.pacman_name;
            }
            else if(Board.bound[this.coordinates.x][this.coordinates.y-1]==' '){
                Board.bound[this.coordinates.x][this.coordinates.y]='#';
                this.coordinates.x=this.coordinates.y-1;
                Board.bound[this.coordinates.x][this.coordinates.y]=this.pacman_name;
            }*/

      /*  public void Avoid_Hurdles(pacman_controlled_walk Player){
        if(objB1.bound[Player.coordinates.x][Player.coordinates.y]=='#'){
            PacMan_Hurdle_lives=PacMan_Hurdle_lives-1;
            if(objB1.bound[Player.coordinates.x-1][Player.coordinates.y]==' '){
                Board.bound[Player.coordinates.x][Player.coordinates.y]='#';
                Player.coordinates.x=Player.coordinates.x-1;
                Board.bound[Player.coordinates.x][Player.coordinates.y]=Player.pacman_name;
            }else if(objB1.bound[Player.coordinates.x][Player.coordinates.y-1]==' '){
                Board.bound[Player.coordinates.x][Player.coordinates.y]='#';
                Player.coordinates.x=Player.coordinates.y-1;
                Board.bound[Player.coordinates.x][Player.coordinates.y]=Player.pacman_name;
            }else if(objB1.bound[Player.coordinates.x+1][Player.coordinates.y]==' '){
                Board.bound[Player.coordinates.x][Player.coordinates.y]='#';
                Player.coordinates.x=Player.coordinates.x+1;
                Board.bound[Player.coordinates.x][Player.coordinates.y]=Player.pacman_name;
            }
            else if(objB1.bound[Player.coordinates.x][Player.coordinates.y+1]==' '){
                Board.bound[Player.coordinates.x][Player.coordinates.y]='#';
                Player.coordinates.x=Player.coordinates.y+1;
                Board.bound[Player.coordinates.x][Player.coordinates.y]=Player.pacman_name;
            }
            if(PacMan_Hurdle_lives==0){
                System.out.println("YOUR HURDLE LIVES OVER!!! \nGAME OVER!!!");
                //have to write the points

            }
        }
    }*/
}
/*if(Board.bound[this.E_coordinates.x][this.E_coordinates.y] == objpac.pacman_name){
        Board.bound[this.E_coordinates.x][this.E_coordinates.y] = ;
        }
        else{
        Board.bound[this.E_coordinates.x][this.E_coordinates.y] = '.';}*/