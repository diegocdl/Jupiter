package vsim.riscv.instructions.jtype;

import vsim.Globals;


public final class Jal extends JType {

  public Jal() {
    super(
      "jal",
      "jal rd, imm",
      "set rd = pc + 4 and pc = pc + imm"
    );
    // set opcode
    this.opcode = 1101111;
  }

  @Override
  protected int compute(int imm) {
    int pc = Globals.regfile.getProgramCounter();
    Globals.regfile.setProgramCounter(pc + imm);
    return pc + 4;
  }

}
