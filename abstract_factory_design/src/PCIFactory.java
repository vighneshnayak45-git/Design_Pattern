public class PCIFactory implements RequestFactory{

    @Override
    public Notify notifyUser() {
        return new PCINotify();
    }

    @Override
    public Attestation performAttestation() {
        return new PCIAttestation();
    }
}
