package com.jetbrains.python.psi.impl.stubs;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.stubs.StubElement;
import com.intellij.psi.stubs.StubInputStream;
import com.intellij.psi.stubs.StubOutputStream;
import com.jetbrains.python.psi.PyDecoratorList;
import com.jetbrains.python.psi.PyStubElementType;
import com.jetbrains.python.psi.impl.PyDecoratorListImpl;
import com.jetbrains.python.psi.stubs.PyDecoratorListStub;

import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * User: dcheryasov
 * Date: Sep 28, 2008
 */
public class PyDecoratorListElementType extends PyStubElementType<PyDecoratorListStub, PyDecoratorList> {

  public PyDecoratorListElementType() {
    super("DECORATOR_LIST");
  }

  public PsiElement createElement(final ASTNode node) {
    return new PyDecoratorListImpl(node);
  }

  public PyDecoratorList createPsi(final PyDecoratorListStub stub) {
    return new PyDecoratorListImpl(stub);
  }

  public PyDecoratorListStub createStub(final PyDecoratorList psi, final StubElement parentStub) {
    return new PyDecoratorListStubImpl(parentStub);
  }

  public void serialize(final PyDecoratorListStub stub, final StubOutputStream dataStream) throws IOException {
    // nothing
  }

  public PyDecoratorListStub deserialize(final StubInputStream dataStream, final StubElement parentStub) throws IOException {
    return new PyDecoratorListStubImpl(parentStub); 
  }
}
