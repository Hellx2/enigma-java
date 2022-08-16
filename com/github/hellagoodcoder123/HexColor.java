package com.github.hellagoodcoder123;

public class HexColor extends Entity {
  public byte red;
  public byte green;
  public byte blue;
  public String toString(){
    short a=red+128;
    short b=green+128;
    short c=blue+128;
    String d=(a<16)?"0":((a<32)?"1":((a<48)?"2":((a<64)?"3":((a<80)?"4":((a<96)?"5":((a<112)?"6":((a<128)?"7":((a<144)?"8":((a<160)?"9":((a<176)?"A":((a<192)?:"B":((a<208)?:"C":((a<224)?:"D":((a<240)?:"E":"F"))))))))))))));
    for(int i=0;a>=16;i++){
      a-=16;
    }
    String e=String.valueOf(a);
    String f=e=="15"?"F":(e=="14"?"E":(e=="13"?"D":(e=="12"?"C":(e=="11"?"B":(e=="10"?"A":e)))));
    String g=(b<16)?"0":((b<32)?"1":((b<48)?"2":((b<64)?"3":((b<80)?"4":((b<96)?"5":((b<112)?"6":((b<128)?"7":((b<144)?"8":((b<160)?"9":((b<176)?"A":((b<192)?:"B":((b<208)?:"C":((b<224)?:"D":((b<240)?:"E":"F"))))))))))))));
    for(int i=0;b>=16;i++){
      b-=16;
    }
    String h=String.valueOf(b);
    String j=h=="15"?"F":(h=="14"?"E":(h=="13"?"D":(h=="12"?"C":(h=="11"?"B":(h=="10"?"A":h)))));
    String k=(c<16)?"0":((c<32)?"1":((c<48)?"2":((c<64)?"3":((c<80)?"4":((c<96)?"5":((c<112)?"6":((c<128)?"7":((c<144)?"8":((c<160)?"9":((c<176)?"A":((c<192)?:"B":((c<208)?:"C":((c<224)?:"D":((c<240)?:"E":"F"))))))))))))));
    for(int i=0;c>=16;i++){
      c-=16;
    }
    String l=String.valueOf(c);
    String m=l=="15"?"F":(l=="14"?"E":(l=="13"?"D":(l=="12"?"C":(l=="11"?"B":(l=="10"?"A":l)))));
    return "#"+d+f+g+j+k+m;
  }
  public HexColor(byte red,byte green,byte blue){
    this.red=red;
    this.green=green;
    this.blue=blue;
  }
}
