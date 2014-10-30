index（查找字符串中第一个出现的指定字符）
相关函数
rindex，srechr，strrchr
表头文件
#include<string.h>
定义函数
char * index( const char *s, int c);
函数说明
index()用来找出参数s字符串中第一个出现的参数c地址，然后将该字符出现的地址返回。字符串结束字符(NULL)也视为字符串一部分。
返回值
如果找到指定的字符则返回该字符所在地址，否则返回0。
范例
#include<string.h>
main()
{
char *s =”0123456789012345678901234567890”;
char *p;
p =index(s,’5’);
printf(%s\n”,p);
}
执行
5.68E+25