gcvt（将浮点型数转换为字符串，取四舍五入）
相关函数
ecvt，fcvt，sprintf
表头文件
#include<stdlib.h>
定义函数
char *gcvt(double number，size_t ndigits，char *buf);
函数说明
gcvt()用来将参数number转换成ASCII码字符串，参数ndigits表示显示的位数。gcvt()与ecvt()和fcvt()不同的地方在于，gcvt()所转换后的字符串包含小数点或正负符号。若转换成功，转换后的字符串会放在参数buf指针所指的空间。
返回值
返回一字符串指针，此地址即为buf指针。
附加说明

范例
#include<stdlib.h>
main()
{
double a=123.45;
double b=-1234.56;
char *ptr;
int decpt,sign;
gcvt(a,5,ptr);
printf(“a value=%s\n”,ptr);
ptr=gcvt(b,6,ptr);
printf(“b value=%s\n”,ptr);
}
执行
a value=123.45
b value=-1234.56