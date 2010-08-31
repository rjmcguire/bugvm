#include <nullvm.h>
#include "assert.h"

int main(int argc, char* argv[]) {
    Options options;
    Env* env = nvmStartup(&options);

    Class* StackOpcodes = nvmFindClass(env, "org/nullvm/compiler/tests/opcode/StackOpcodes");
    jint (*swap_int)(void*, Env*, jint, jint) = nvmGetClassMethod(env, StackOpcodes, "swap_int", "(II)I")->impl;
    jint (*dup_int)(void*, Env*, jint) = nvmGetClassMethod(env, StackOpcodes, "dup_int", "(I)I")->impl;
    jint (*dup2_int)(void*, Env*, jint) = nvmGetClassMethod(env, StackOpcodes, "dup2_int", "(I)I")->impl;
    jdouble (*dup2_double)(void*, Env*, jdouble) = nvmGetClassMethod(env, StackOpcodes, "dup2_double", "(D)D")->impl;
    jlong (*dup2_long)(void*, Env*, jlong) = nvmGetClassMethod(env, StackOpcodes, "dup2_long", "(J)J")->impl;
    jint (*dup_x1)(void*, Env*, jint, jint) = nvmGetClassMethod(env, StackOpcodes, "dup_x1", "(II)I")->impl;
    jint (*dup_x2)(void*, Env*, jint, jint, jint) = nvmGetClassMethod(env, StackOpcodes, "dup_x2", "(III)I")->impl;
    jint (*dup_x2_long)(void*, Env*, jlong, jint) = nvmGetClassMethod(env, StackOpcodes, "dup_x2", "(JI)I")->impl;
    jint (*dup2_x1)(void*, Env*, jint, jint, jint) = nvmGetClassMethod(env, StackOpcodes, "dup2_x1", "(III)I")->impl;
    jint (*dup2_x1_long)(void*, Env*, jint, jlong) = nvmGetClassMethod(env, StackOpcodes, "dup2_x1", "(IJ)I")->impl;
    jint (*dup2_x2_int)(void*, Env*, jint, jint, jint, jint) = nvmGetClassMethod(env, StackOpcodes, "dup2_x2", "(IIII)I")->impl;
    jdouble (*dup2_x2_double)(void*, Env*, jdouble, jdouble) = nvmGetClassMethod(env, StackOpcodes, "dup2_x2", "(DD)D")->impl;
    jint (*dup2_x2_int_int_long)(void*, Env*, jint, jint, jlong) = nvmGetClassMethod(env, StackOpcodes, "dup2_x2", "(IIJ)I")->impl;
    jint (*dup2_x2_long_int_int)(void*, Env*, jlong, jint, jint) = nvmGetClassMethod(env, StackOpcodes, "dup2_x2", "(JII)I")->impl;

    assertEqualsInt("swap_int", -1, swap_int(NULL, env, 3, 2));

    assertEqualsInt("dup_int", 100, dup_int(NULL, env, 10));

    assertEqualsInt("dup2_int", 81, dup2_int(NULL, env, 3));
    assertEqualsInt("dup2_int", 0, dup2_int(NULL, env, 0x80000000));

    assertEqualsDouble("dup2_double", 9.0, dup2_double(NULL, env, 3.0));
    assertEqualsDouble("dup2_double", 1.0/0.0, dup2_double(NULL, env, 0x1.fffffffffffffP+1023));
    assertEqualsLong("dup2_long", 9L, dup2_long(NULL, env, 3L));
    assertEqualsLong("dup2_long", 0L, dup2_long(NULL, env, 0x8000000000000000L));

    assertEqualsInt("dup_x1", -88, dup_x1(NULL, env, 9, 11));
    assertEqualsInt("dup_x1", 168, dup_x1(NULL, env, -20, 8));

    assertEqualsInt("dup_x2(int, int, int)", -121, dup_x2(NULL, env, 9, 11, 13));
    assertEqualsInt("dup_x2(int, int, int)", -34, dup_x2(NULL, env, -20, 8, 2));
    assertEqualsInt("dup_x2(long, int)", -88, dup_x2_long(NULL, env, 9, 11));

    assertEqualsInt("dup2_x1(int, int, int)", -64, dup2_x1(NULL, env, 2, 16, 2));
    assertEqualsInt("dup2_x1(int, long)", -88, dup2_x1_long(NULL, env, 9, 11));

    assertEqualsInt("dup2_x2(int, int, int, int)", 8, dup2_x2_int(NULL, env, 2, 2, 16, 2));
    assertEqualsDouble("dup2_x2(double, double)", -88.0, dup2_x2_double(NULL, env, 9.0, 11.0));
    assertEqualsDouble("dup2_x2(double, double)", 168.0, dup2_x2_double(NULL, env, -20.0, 8.0));
    assertEqualsInt("dup2_x2(int, int, long)", -32, dup2_x2_int_int_long(NULL, env, 2, 16, 2));
    assertEqualsInt("dup2_x2(long, int, int)", -512, dup2_x2_long_int_int(NULL, env, 2, 16, 2));

    print_test_result();

    return 0;
}


