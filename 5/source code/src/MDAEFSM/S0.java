package MDAEFSM;

class S0 extends State {

    S0(StateMachine model) {
        super(model);
    }

    @Override
    void start() {
        if (model.s == model.LS[0]) {
            model.s = model.LS[1];
            model.getOP().PayMsg();
        }
    }
}
