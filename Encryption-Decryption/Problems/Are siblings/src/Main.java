public boolean areSiblings(File f1, File f2) {
    // implement me
        if(f1.getParentFile().getName().equals(f2.getParentFile().getName())){
            return true;
        } else return false;
}