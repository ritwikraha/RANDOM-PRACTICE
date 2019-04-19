# Create skin and bone masks
mask_bone = im>=145
mask_skin0 = im>=45

mask_skin = mask_skin0 &~ mask_bone

# Plot the skin (0) and bone (1) masks
fig, axes = plt.subplots(1,2)
axes[0].imshow(mask_skin,cmap='gray')
axes[1].imshow(mask_bone,cmap='gray')
format_and_render_plot()