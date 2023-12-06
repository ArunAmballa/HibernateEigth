package com.arun.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Branch 

{
		@Id
		private String bid;
		
		private String branchName;
		 
		private String blocation;

		public String getBid() {
			return bid;
		}

		public void setBid(String bid) {
			this.bid = bid;
		}

		public String getBranchName() {
			return branchName;
		}

		public void setBranchName(String branchName) {
			this.branchName = branchName;
		}

		public String getBlocation() {
			return blocation;
		}

		public void setBlocation(String blocation) {
			this.blocation = blocation;
		}

		@Override
		public String toString() {
			return "Branch [bid=" + bid + ", branchName=" + branchName + ", blocation=" + blocation + "]";
		}
		
		



}
