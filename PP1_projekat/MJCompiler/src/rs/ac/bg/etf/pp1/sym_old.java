package rs.ac.bg.etf.pp1;

public class sym_old {
		
	
/*Za sve moguce tokene koji se mogu javiti u Mikrojavi
 *mi moramo da odvojimo jedinstveni kod za svaki token.
 *Tokeni koje lekser moze vratiti mogu biti: kljucne reci,
 *konstante, identifikatori, operatori, takodje on ce 
 *obradjivati komentare napisane u jednoj liniji, a podrzani
 *tip je podrazumevano int
 *
 *Ovde identifikujemo sve tokene koje ce vracati lekser, i svaki token
 *predvidimo jedinstvenim identifikatorom; obratiti paznju da se
 *u sledecoj fazi ova klasa sama generise, tako da cemo je obrisati
 */
	
		//Kljucne reci
		public static final int PROG=1;
		public static final int BREAK=2;
		public static final int CLASS=3;
		public static final int INTERFACE=4;	
		public static final int ENUM=5;
		public static final int ELSE=6;
		public static final int CONST=7;
		public static final int IF=8;
		public static final int NEW=9;
		public static final int PRINT=10;
		public static final int READ=11;
		public static final int RETURN=12;
		public static final int VOID=13;
		public static final int FOR=14;
		public static final int EXTENDS=15;	
		public static final int CONTINUE=16;
		public static final int IMPLEMENTS=47;	
	
		
		//Identifikatori
		public static final int IDENT = 17;
		
		//Konstante
		public static final int NUMBER=18;
		public static final int CHAR=19;
		public static final int BOOL=20;
		
		//Operatori
		public static final int PLUS=21;
		public static final int MINUS=22;
		public static final int MULTIPLY=23;
		public static final int DIVIDE=24;
		public static final int MOD=25;
		public static final int EQUALS=26;
		public static final int DIFFERENT=27;
		public static final int MORE=28;
		public static final int MOREEQUAL=29;
		public static final int LESS=30;
		public static final int LESSEQUAL=31;
		public static final int AND=32;
		public static final int OR=33;
		public static final int EQUAL=34;
		public static final int INC=35;
		public static final int DEC=36;
		public static final int SEMI=37;
		public static final int COMMA=38;
		public static final int DOT=39;
		public static final int LPAREN=40;
		public static final int RPAREN=41;
		public static final int LBRACKETS=42;
		public static final int RBRACKETS=43;
		public static final int LBRACE=44;
		public static final int RBRACE=45;
		
		public static final int EOF=46;
}
