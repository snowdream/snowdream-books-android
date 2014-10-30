crypt（将密码或数据编码）
相关函数
getpass
表头文件
#define _XOPEN_SOURCE
#include<unistd.h>
定义函数
char * crypt (const char *key,const char * salt);
函数说明
crypt()将使用Data Encryption Standard(DES)演算法将参数key所指的字符串加以编码，key字符串长度仅取前8个字符，超过此长度的字符没有意义。参数salt为两个字符组成的字符串，由a-z、A-Z、0-9，“.”和“/”所组成，用来决定使用4096 种不同内建表格的哪一个。函数执行成功后会返回指向编码过的字符串指针，参数key 所指的字符串不会有所更动。编码过的字符串长度为13 个字符，前两个字符为参数salt代表的字符串。
返回值
返回一个指向以NULL结尾的密码字符串。
附加说明
使用GCC编译时需加-lcrypt。
范例
#include<unistd.h>
main()
{
char passwd[13];
char *key;
char slat[2];
key= getpass(“Input First Password:”);
slat[0]=key[0];
slat[1]=key[1];
strcpy(passwd,crypt(key slat));
key=getpass(“Input Second Password:”);
slat[0]=passwd[0];
slat[1]=passwd[1];
printf(“After crypt(),1st passwd :%s\n”,passwd);
printf(“After crypt(),2nd passwd:%s \n”,crypt(key slat));
}
执行
Input First Password: /* 输入test，编码后存于passwd[ ] */
Input Second Password /*输入test，密码相同编码后也会相同*/
After crypt () 1st Passwd : teH0wLIpW0gyQ
After crypt () 2nd Passwd : teH0wLIpW0gyQ