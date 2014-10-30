frexp（将浮点型数分为底数与指数）
相关函数
ldexp，modf
表头文件
#include<math.h>
定义函数
double frexp( double x, int *exp);
函数说明
frexp()用来将参数x 的浮点型数切割成底数和指数。底数部分直接返回，指数部分则借参数exp 指针返回，将返回值乘以2 的exp次方即为x的值。
返回值
返回参数x的底数部分，指数部分则存于exp指针所指的地址。
附加说明
使用GCC编译时请加入-lm。
范例
#include <math.h>
main()
{
int exp;
double fraction;
fraction = frexp (1024,&exp);
printf("exp = %d\n",exp);
printf("fraction = %f\n", fraction);
}
执行
exp = 11
fraction = 0.500000 /* 0.5*(2^11)=1024*/