toupper（将小写字母转换成大写字母）
相关函数
isalpha，tolower
表头文件
#include<ctype.h>
定义函数
int toupper(int c);
函数说明
若参数c为小写字母则将该对映的大写字母返回。
返回值
返回转换后的大写字母，若不须转换则将参数c值返回。
附加说明

范例
/* 将s字符串内的小写字母转换成大写字母*/
#include<ctype.h>
main()
{
char s[]=”aBcDeFgH12345;!#$”;
int i;
printf(“before toupper() : %s\n”,s);
for(i=0;I<sizeof(s);i++)
s[i]=toupper(s[i]);
printf(“after toupper() : %s\n”,s);
}
执行
before toupper() : aBcDeFgH12345;!#$
after toupper() : ABCDEFGH12345;!#$