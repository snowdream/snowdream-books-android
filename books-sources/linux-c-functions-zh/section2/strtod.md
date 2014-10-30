strtod（将字符串转换成浮点数）
相关函数
atoi，atol，strtod，strtol，strtoul
表头文件
#include<stdlib.h>
定义函数
double strtod(const char *nptr,char **endptr);
函数说明
strtod()会扫描参数nptr字符串，跳过前面的空格字符，直到遇上数字或正负符号才开始做转换，到出现非数字或字符串结束时('\0')才结束转换，并将结果返回。若endptr不为NULL，则会将遇到不合条件而终止的nptr中的字符指针由endptr传回。参数nptr字符串可包含正负号、小数点或E(e)来表示指数部分。如123.456或123e-2。
返回值
返回转换后的浮点型数。
附加说明
参考atof()。
范例
/*将字符串a，b，c 分别采用10，2，16 进制转换成数字*/
#include<stdlib.h>
mian()
{
char a[]=”1000000000”;
char b[]=”1000000000”;
char c[]=”ffff”;
printf(“a=%d\n”,strtod(a,NULL,10));
printf(“b=%d\n”,strtod(b,NULL,2));
printf(“c=%d\n”,strtod(c,NULL,16));
}
执行
a=1000000000
b=512
c=65535