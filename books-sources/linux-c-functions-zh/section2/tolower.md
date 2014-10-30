tolower（将大写字母转换成小写字母）
相关函数
isalpha，toupper
表头文件
#include<stdlib.h>
定义函数
int tolower(int c);
函数说明
若参数c为大写字母则将该对应的小写字母返回。
返回值
返回转换后的小写字母，若不须转换则将参数c值返回。
附加说明

范例
/* 将s字符串内的大写字母转换成小写字母*/
#include<ctype.h>
main()
{
char s[]=”aBcDeFgH12345;!#$”;
int i;
printf(“before tolower() : %s\n”,s);
for(i=0;I<sizeof(s);i++)
s[i]=tolower(s[i]);
printf(“after tolower() : %s\n”,s);
}
执行
before tolower() : aBcDeFgH12345;!#$
after tolower() : abcdefgh12345;!#$