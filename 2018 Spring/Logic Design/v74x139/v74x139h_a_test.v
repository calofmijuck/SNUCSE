`timescale 1ns / 1ps

////////////////////////////////////////////////////////////////////////////////
// Company: 
// Engineer:
//
// Create Date:   19:01:06 04/03/2018
// Design Name:   v74x139h_a
// Module Name:   /csehome/calofmijuck/Desktop/v74x139/v74x139h_a_test.v
// Project Name:  v74x139
// Target Device:  
// Tool versions:  
// Description: 
//
// Verilog Test Fixture created by ISE for module: v74x139h_a
//
// Dependencies:
// 
// Revision:
// Revision 0.01 - File Created
// Additional Comments:
// 
////////////////////////////////////////////////////////////////////////////////

module v74x139h_a_test;

	// Inputs
	reg G_L;
	reg A;
	reg B;

	// Outputs
	wire Y0_L;
	wire Y1_L;
	wire Y2_L;
	wire Y3_L;

	// Instantiate the Unit Under Test (UUT)
	v74x139h_a uut (
		.G_L(G_L), 
		.A(A), 
		.B(B), 
		.Y0_L(Y0_L), 
		.Y1_L(Y1_L), 
		.Y2_L(Y2_L), 
		.Y3_L(Y3_L)
	);

	initial begin
		// Initialize Inputs
		G_L = 0;
		A = 0;
		B = 0;
		#100;
      
		G_L = 0;
		A = 0;
		B = 1;
		#100;
		
		G_L = 0;
		A = 1;
		B = 0;
		#100;
		
		G_L = 0;
		A = 1;
		B = 1;
		#100;
		
		G_L = 1;
		A = 0;
		B = 0;
		#100;
		
		G_L = 1;
		A = 0;
		B = 1;
		#100;
		
		G_L = 1;
		A = 1;
		B = 0;
		#100;
		
		G_L = 1;
		A = 1;
		B = 1;
		#100;
	end
      
endmodule

