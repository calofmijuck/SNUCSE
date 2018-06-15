`timescale 1ns / 1ps
//////////////////////////////////////////////////////////////////////////////////
// Company: 
// Engineer: 
// 
// Create Date:    18:47:34 04/03/2018 
// Design Name: 
// Module Name:    v74x139h_a 
// Project Name: 
// Target Devices: 
// Tool versions: 
// Description: 
//
// Dependencies: 
//
// Revision: 
// Revision 0.01 - File Created
// Additional Comments: 
//
//////////////////////////////////////////////////////////////////////////////////
module v74x139h_a(
    input G_L,
    input A,
    input B,
    output [3:0] Y_L
    );
	
	 wire G;
	 wire A_L;
	 wire B_L;
	 wire A_i;
	 wire	B_i;
	 
	 not (A_L, A);
	 not (B_L, B);
	 not (G, G_L);
	 not (A_i, A_L);
	 not (B_i, B_L);
	 
	 nand (Y_L[0], A_L, B_L, G);
	 nand (Y_L[1], G, B_L, A_i);
	 nand (Y_L[2], G, A_L, B_i);
	 nand (Y_L[3], G, A_i, B_i);
	 
	 

endmodule
