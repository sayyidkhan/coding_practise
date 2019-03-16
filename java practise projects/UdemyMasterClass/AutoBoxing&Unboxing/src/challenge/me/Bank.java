package challenge.me;

import java.util.ArrayList;

public class Bank {

    private ArrayList<Branch> branches;

    public Bank(String branchName) {
        this.branches = new ArrayList<Branch>();
        this.branches.add(new Branch(branchName.toLowerCase()));
    }

    public void addNewBranch(String branchName){
        if(findBranch(branchName)){
            System.out.println("branch already exist, unable to add.");
        }
        else {
            this.branches.add(new Branch(branchName.toLowerCase()));
            System.out.println("branch " + branchName + " successfully added.");
        }
    }

    public void showAllBranches(){
        System.out.println("##################################");
        System.out.println("Showing all banks under this branch");
        for(int i = 0;i < this.branches.size();i++){
            System.out.println((i+1) + ". " + this.branches.get(i).getBranchName());
        }
        System.out.println("##################################");
    }

    public Branch searchForBranchObject(String branchName){
        for(int i = 0;i < this.branches.size();i++) {
            String currentBranch = this.branches.get(i).getBranchName();
            if(currentBranch.equals(branchName.toLowerCase())){
                return this.branches.get(i);
            }
        }
        return null;
    }

    private boolean findBranch(String branchName){
        // != null returns branch exist
        // == null branch does not exist
        return (searchForBranchObject(branchName) != null);
    }

    public void searchForBranch(String branchName){
        if(findBranch(branchName)) {
            System.out.println("Branch name " + branchName + " is found.");
        }
        else {
            System.out.println("branch " +  branchName + " is not found");
        }
    }

}
