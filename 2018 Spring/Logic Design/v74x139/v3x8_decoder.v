`timescale 1ns / 1ps
//////////////////////////////////////////////////////////////////////////////////
// Company: 
// Engineer: 
// 
// Create Date:    20:27:35 04/03/2018 
// Design Name: 
// Module Name:    v3x8_decoder 
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
module v3x8_decoder(
    input A,
    input B,
    input C,
    output [7:0] Y
    );
	wire _bar = ~A;
	
	v74x139h_a T1(.G_L(_bar), .A(B), .B(C), .Y_L(Y[7:4]));
	v74x139h_a T2(.G_L(A), .A(B), .B(C), .Y_L(Y[3:0]));

endmodule
