/* BasicParserTokenManager.java */
/* Generated By:JavaCC: Do not edit this line. BasicParserTokenManager.java */
package fr.utbm.info.da53.lw2.parser;
import java.io.StringReader;
import fr.utbm.info.da53.lw2.symbol.*;

/** Token Manager. */
@SuppressWarnings ("unused")
public class BasicParserTokenManager implements BasicParserConstants {

  /** Debug output. */
  public  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private final int jjStopStringLiteralDfa_0(int pos, long active0){
   switch (pos)
   {
      case 0:
         if ((active0 & 0x2000L) != 0L)
         {
            jjmatchedKind = 45;
            return 8;
         }
         if ((active0 & 0x13f003ffde00L) != 0L)
         {
            jjmatchedKind = 45;
            return 17;
         }
         return -1;
      case 1:
         if ((active0 & 0x2000L) != 0L)
         {
            jjmatchedKind = 45;
            jjmatchedPos = 1;
            return 0;
         }
         if ((active0 & 0x2001210000L) != 0L)
            return 17;
         if ((active0 & 0x13d002dede00L) != 0L)
         {
            jjmatchedKind = 45;
            jjmatchedPos = 1;
            return 17;
         }
         return -1;
      case 2:
         if ((active0 & 0x130002ce6e00L) != 0L)
         {
            jjmatchedKind = 45;
            jjmatchedPos = 2;
            return 17;
         }
         if ((active0 & 0xd000109000L) != 0L)
            return 17;
         return -1;
      case 3:
         if ((active0 & 0x110000086a00L) != 0L)
         {
            jjmatchedKind = 45;
            jjmatchedPos = 3;
            return 17;
         }
         if ((active0 & 0x20002c60400L) != 0L)
            return 17;
         return -1;
      case 4:
         if ((active0 & 0x110000084a00L) != 0L)
            return 17;
         if ((active0 & 0x2000L) != 0L)
         {
            jjmatchedKind = 45;
            jjmatchedPos = 4;
            return 17;
         }
         return -1;
      default :
         return -1;
   }
}
private final int jjStartNfa_0(int pos, long active0){
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private int jjMoveStringLiteralDfa0_0(){
   switch(curChar)
   {
      case 10:
         return jjStopAtPos(0, 5);
      case 40:
         return jjStopAtPos(0, 7);
      case 41:
         return jjStopAtPos(0, 8);
      case 42:
         return jjStopAtPos(0, 34);
      case 43:
         return jjStopAtPos(0, 32);
      case 44:
         return jjStopAtPos(0, 42);
      case 45:
         return jjStopAtPos(0, 33);
      case 47:
         return jjStopAtPos(0, 35);
      case 60:
         jjmatchedKind = 30;
         return jjMoveStringLiteralDfa1_0(0x14000000L);
      case 61:
         return jjStopAtPos(0, 27);
      case 62:
         jjmatchedKind = 31;
         return jjMoveStringLiteralDfa1_0(0x20000000L);
      case 65:
      case 97:
         return jjMoveStringLiteralDfa1_0(0x1000000000L);
      case 68:
      case 100:
         return jjMoveStringLiteralDfa1_0(0x1000000L);
      case 69:
      case 101:
         return jjMoveStringLiteralDfa1_0(0x48000L);
      case 70:
      case 102:
         return jjMoveStringLiteralDfa1_0(0x10000100000L);
      case 71:
      case 103:
         return jjMoveStringLiteralDfa1_0(0x4400L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa1_0(0x10800L);
      case 76:
      case 108:
         return jjMoveStringLiteralDfa1_0(0x1000L);
      case 78:
      case 110:
         return jjMoveStringLiteralDfa1_0(0x8000800000L);
      case 79:
      case 111:
         return jjMoveStringLiteralDfa1_0(0x2000000000L);
      case 80:
      case 112:
         return jjMoveStringLiteralDfa1_0(0x200L);
      case 82:
      case 114:
         return jjMoveStringLiteralDfa1_0(0x2000L);
      case 83:
      case 115:
         return jjMoveStringLiteralDfa1_0(0x400000L);
      case 84:
      case 116:
         return jjMoveStringLiteralDfa1_0(0x20000220000L);
      case 85:
      case 117:
         return jjMoveStringLiteralDfa1_0(0x100000000000L);
      case 87:
      case 119:
         return jjMoveStringLiteralDfa1_0(0x2080000L);
      case 88:
      case 120:
         return jjMoveStringLiteralDfa1_0(0x4000000000L);
      default :
         return jjMoveNfa_0(9, 0);
   }
}
private int jjMoveStringLiteralDfa1_0(long active0){
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 61:
         if ((active0 & 0x10000000L) != 0L)
            return jjStopAtPos(1, 28);
         else if ((active0 & 0x20000000L) != 0L)
            return jjStopAtPos(1, 29);
         break;
      case 62:
         if ((active0 & 0x4000000L) != 0L)
            return jjStopAtPos(1, 26);
         break;
      case 65:
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x10000000000L);
      case 69:
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x2803000L);
      case 70:
      case 102:
         if ((active0 & 0x10000L) != 0L)
            return jjStartNfaWithStates_0(1, 16, 17);
         break;
      case 72:
      case 104:
         return jjMoveStringLiteralDfa2_0(active0, 0xa0000L);
      case 76:
      case 108:
         return jjMoveStringLiteralDfa2_0(active0, 0x40000L);
      case 78:
      case 110:
         return jjMoveStringLiteralDfa2_0(active0, 0x101000008800L);
      case 79:
      case 111:
         if ((active0 & 0x200000L) != 0L)
            return jjStartNfaWithStates_0(1, 21, 17);
         else if ((active0 & 0x1000000L) != 0L)
            return jjStartNfaWithStates_0(1, 24, 17);
         return jjMoveStringLiteralDfa2_0(active0, 0xc000104400L);
      case 82:
      case 114:
         if ((active0 & 0x2000000000L) != 0L)
            return jjStartNfaWithStates_0(1, 37, 17);
         return jjMoveStringLiteralDfa2_0(active0, 0x20000000200L);
      case 84:
      case 116:
         return jjMoveStringLiteralDfa2_0(active0, 0x400000L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
private int jjMoveStringLiteralDfa2_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 68:
      case 100:
         if ((active0 & 0x8000L) != 0L)
            return jjStartNfaWithStates_0(2, 15, 17);
         else if ((active0 & 0x1000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 36, 17);
         return jjMoveStringLiteralDfa3_0(active0, 0x100000000000L);
      case 69:
      case 101:
         return jjMoveStringLiteralDfa3_0(active0, 0x420000L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0x80200L);
      case 76:
      case 108:
         return jjMoveStringLiteralDfa3_0(active0, 0x10000000000L);
      case 78:
      case 110:
         return jjMoveStringLiteralDfa3_0(active0, 0x2000000L);
      case 80:
      case 112:
         return jjMoveStringLiteralDfa3_0(active0, 0x800L);
      case 82:
      case 114:
         if ((active0 & 0x100000L) != 0L)
            return jjStartNfaWithStates_0(2, 20, 17);
         else if ((active0 & 0x4000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 38, 17);
         break;
      case 83:
      case 115:
         return jjMoveStringLiteralDfa3_0(active0, 0x44000L);
      case 84:
      case 116:
         if ((active0 & 0x1000L) != 0L)
            return jjStartNfaWithStates_0(2, 12, 17);
         else if ((active0 & 0x8000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 39, 17);
         return jjMoveStringLiteralDfa3_0(active0, 0x2400L);
      case 85:
      case 117:
         return jjMoveStringLiteralDfa3_0(active0, 0x20000000000L);
      case 88:
      case 120:
         return jjMoveStringLiteralDfa3_0(active0, 0x800000L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
private int jjMoveStringLiteralDfa3_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 68:
      case 100:
         if ((active0 & 0x2000000L) != 0L)
            return jjStartNfaWithStates_0(3, 25, 17);
         break;
      case 69:
      case 101:
         if ((active0 & 0x40000L) != 0L)
            return jjStartNfaWithStates_0(3, 18, 17);
         else if ((active0 & 0x20000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 41, 17);
         return jjMoveStringLiteralDfa4_0(active0, 0x100000000000L);
      case 76:
      case 108:
         return jjMoveStringLiteralDfa4_0(active0, 0x80000L);
      case 78:
      case 110:
         if ((active0 & 0x20000L) != 0L)
            return jjStartNfaWithStates_0(3, 17, 17);
         return jjMoveStringLiteralDfa4_0(active0, 0x200L);
      case 79:
      case 111:
         if ((active0 & 0x400L) != 0L)
            return jjStartNfaWithStates_0(3, 10, 17);
         break;
      case 80:
      case 112:
         if ((active0 & 0x400000L) != 0L)
            return jjStartNfaWithStates_0(3, 22, 17);
         break;
      case 83:
      case 115:
         return jjMoveStringLiteralDfa4_0(active0, 0x10000000000L);
      case 84:
      case 116:
         if ((active0 & 0x800000L) != 0L)
            return jjStartNfaWithStates_0(3, 23, 17);
         break;
      case 85:
      case 117:
         return jjMoveStringLiteralDfa4_0(active0, 0x6800L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
private int jjMoveStringLiteralDfa4_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 66:
      case 98:
         if ((active0 & 0x4000L) != 0L)
            return jjStartNfaWithStates_0(4, 14, 17);
         break;
      case 69:
      case 101:
         if ((active0 & 0x80000L) != 0L)
            return jjStartNfaWithStates_0(4, 19, 17);
         else if ((active0 & 0x10000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 40, 17);
         break;
      case 70:
      case 102:
         if ((active0 & 0x100000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 44, 17);
         break;
      case 82:
      case 114:
         return jjMoveStringLiteralDfa5_0(active0, 0x2000L);
      case 84:
      case 116:
         if ((active0 & 0x200L) != 0L)
            return jjStartNfaWithStates_0(4, 9, 17);
         else if ((active0 & 0x800L) != 0L)
            return jjStartNfaWithStates_0(4, 11, 17);
         break;
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
private int jjMoveStringLiteralDfa5_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 78:
      case 110:
         if ((active0 & 0x2000L) != 0L)
            return jjStartNfaWithStates_0(5, 13, 17);
         break;
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 18;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 8:
               case 17:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 45)
                     kind = 45;
                  { jjCheckNAdd(17); }
                  break;
               case 9:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 6)
                        kind = 6;
                     { jjCheckNAddTwoStates(10, 11); }
                  }
                  else if (curChar == 34)
                     { jjCheckNAddTwoStates(14, 15); }
                  break;
               case 0:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 45)
                     kind = 45;
                  { jjCheckNAdd(17); }
                  break;
               case 1:
                  if ((0x100000200L & l) != 0L)
                     { jjCheckNAddStates(0, 3); }
                  break;
               case 2:
                  if ((0xffffffffffffdbffL & l) != 0L)
                     { jjCheckNAddStates(0, 3); }
                  break;
               case 3:
                  if ((0x2400L & l) != 0L && kind > 4)
                     kind = 4;
                  break;
               case 4:
                  if (curChar == 10 && kind > 4)
                     kind = 4;
                  break;
               case 5:
                  if (curChar == 13)
                     jjstateSet[jjnewStateCnt++] = 4;
                  break;
               case 6:
                  if (curChar == 13 && kind > 4)
                     kind = 4;
                  break;
               case 7:
                  if (curChar == 10)
                     jjstateSet[jjnewStateCnt++] = 6;
                  break;
               case 10:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 6)
                     kind = 6;
                  { jjCheckNAddTwoStates(10, 11); }
                  break;
               case 11:
                  if (curChar == 46)
                     { jjCheckNAdd(12); }
                  break;
               case 12:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 6)
                     kind = 6;
                  { jjCheckNAdd(12); }
                  break;
               case 13:
                  if (curChar == 34)
                     { jjCheckNAddTwoStates(14, 15); }
                  break;
               case 14:
                  if ((0xfffffffbffffffffL & l) != 0L)
                     { jjCheckNAddTwoStates(14, 15); }
                  break;
               case 15:
                  if (curChar == 34 && kind > 43)
                     kind = 43;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 8:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 45)
                        kind = 45;
                     { jjCheckNAdd(17); }
                  }
                  if ((0x2000000020L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 0;
                  break;
               case 9:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 45)
                        kind = 45;
                     { jjCheckNAdd(17); }
                  }
                  if ((0x4000000040000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 8;
                  break;
               case 0:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 45)
                        kind = 45;
                     { jjCheckNAdd(17); }
                  }
                  if ((0x200000002000L & l) != 0L)
                     { jjCheckNAddStates(4, 7); }
                  break;
               case 2:
                  { jjCheckNAddStates(0, 3); }
                  break;
               case 14:
                  { jjAddStates(8, 9); }
                  break;
               case 16:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 45)
                     kind = 45;
                  { jjCheckNAdd(17); }
                  break;
               case 17:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 45)
                     kind = 45;
                  { jjCheckNAdd(17); }
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 2:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     { jjAddStates(0, 3); }
                  break;
               case 14:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     { jjAddStates(8, 9); }
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 18 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, "\12", null, "\50", "\51", null, null, null, null, 
null, null, null, null, null, null, null, null, null, null, null, null, null, 
"\74\76", "\75", "\74\75", "\76\75", "\74", "\76", "\53", "\55", "\52", "\57", null, 
null, null, null, null, null, "\54", null, null, null, };
protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}
static final int[] jjnextStates = {
   2, 3, 5, 7, 1, 3, 5, 7, 14, 15, 
};

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

/** Get the next Token. */
public Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(Exception e)
   {
      jjmatchedKind = 0;
      jjmatchedPos = -1;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   try { input_stream.backup(0);
      while (curChar <= 32 && (0x100002200L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         return matchedToken;
      }
      else
      {
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

void SkipLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      default :
         break;
   }
}
void MoreLexicalActions()
{
   jjimageLen += (lengthOfMatch = jjmatchedPos + 1);
   switch(jjmatchedKind)
   {
      default :
         break;
   }
}
void TokenLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      default :
         break;
   }
}
private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

    /** Constructor. */
    public BasicParserTokenManager(SimpleCharStream stream){

      if (SimpleCharStream.staticFlag)
            throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");

    input_stream = stream;
  }

  /** Constructor. */
  public BasicParserTokenManager (SimpleCharStream stream, int lexState){
    ReInit(stream);
    SwitchTo(lexState);
  }

  /** Reinitialise parser. */
  
  public void ReInit(SimpleCharStream stream)
  {


    jjmatchedPos =
    jjnewStateCnt =
    0;
    curLexState = defaultLexState;
    input_stream = stream;
    ReInitRounds();
  }

  private void ReInitRounds()
  {
    int i;
    jjround = 0x80000001;
    for (i = 18; i-- > 0;)
      jjrounds[i] = 0x80000000;
  }

  /** Reinitialise parser. */
  public void ReInit(SimpleCharStream stream, int lexState)
  
  {
    ReInit(stream);
    SwitchTo(lexState);
  }

  /** Switch to specified lex state. */
  public void SwitchTo(int lexState)
  {
    if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
    else
      curLexState = lexState;
  }


/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};

/** Lex State array. */
public static final int[] jjnewLexState = {
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
};
static final long[] jjtoToken = {
   0x3fffffffffe1L, 
};
static final long[] jjtoSkip = {
   0x1eL, 
};
static final long[] jjtoSpecial = {
   0x0L, 
};
static final long[] jjtoMore = {
   0x0L, 
};
    protected SimpleCharStream  input_stream;

    private final int[] jjrounds = new int[18];
    private final int[] jjstateSet = new int[2 * 18];
    private final StringBuilder jjimage = new StringBuilder();
    private StringBuilder image = jjimage;
    private int jjimageLen;
    private int lengthOfMatch;
    protected int curChar;
}
