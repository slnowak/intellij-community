class C {
  private int id;
}

class A extends C {
  {
    <error descr="Cannot resolve symbol 'id'">id</error>.MyObject.fromInt(1);

    <error descr="'id' has private access in 'C'">id</error>.MyObject o;
  }
}